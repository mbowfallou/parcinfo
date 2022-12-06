package isi.afagroupe.mapping;

import isi.afagroupe.dto.AppRole;
import isi.afagroupe.entities.AppRoleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AppRoleMapper {
    AppRoleEntity fromAppRole(AppRole appRole);
    AppRole toAppRole(AppRoleEntity appRoleEntity);
}
