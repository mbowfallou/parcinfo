package isi.afagroupe.service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import isi.afagroupe.repository.AppRoleRepository;
import isi.afagroupe.dto.AppRole;
import isi.afagroupe.exception.EntityNotFoundException;
import isi.afagroupe.exception.RequestException;
import isi.afagroupe.mapping.AppRoleMapper;

@Service
@AllArgsConstructor
public class AppRoleService {

    private AppRoleRepository appRoleRepository;
    private AppRoleMapper appRoleMapper;
    private MessageSource messageSource;

    @Transactional(readOnly = true)
    public List<AppRole> getAppRoles() {
        return StreamSupport.stream(appRoleRepository.findAll().spliterator(), false)
                .map(appRoleMapper.INSTANCE::toAppRole)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public AppRole getAppRole(Integer id) {
        return appRoleMapper.INSTANCE.toAppRole(appRoleRepository.findById(id)
                .orElseThrow(
                        () -> new EntityNotFoundException(messageSource.getMessage("appRoleId.notfound", new Object[]{id}, Locale.getDefault()))
                )
        );
    }

    @Transactional(readOnly = true)
    public AppRole getAppRoleByName(String name) {
        return appRoleMapper.INSTANCE.toAppRole(Optional.ofNullable(appRoleRepository.findByNom(name))
                .orElseThrow(() ->
                        new EntityNotFoundException(messageSource.getMessage("appRoleNom.notfound", new Object[]{name},
                                Locale.getDefault()))));
    }

    @Transactional
    public AppRole createAppRole(AppRole AppRole) {
        return appRoleMapper.INSTANCE.toAppRole(appRoleRepository.save(appRoleMapper.fromAppRole(AppRole)));
    }

    @Transactional
    public AppRole updateAppRole(Integer id, AppRole appRole) {
        return appRoleRepository.findById(id)
                .map(entity -> {
                    appRole.setId(id);
                    return appRoleMapper.INSTANCE.toAppRole(appRoleRepository.save(appRoleMapper.fromAppRole(appRole)));
                })
                .orElseThrow(
                        () -> new EntityNotFoundException(messageSource.getMessage("appRoleId.notfound", new Object[]{id}, Locale.getDefault()))
                );
    }

    @Transactional
    public void deleteAppRole(Integer id) {
        try {
            appRoleRepository.deleteById(id);
        } catch (Exception e) {
            throw new RequestException(messageSource.getMessage("appRoleId.errordeletion", new Object[] {id},
                    Locale.getDefault()), HttpStatus.CONFLICT);
        }
    }
}
