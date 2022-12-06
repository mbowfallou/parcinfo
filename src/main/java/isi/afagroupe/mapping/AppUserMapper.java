package isi.afagroupe.mapping;

import isi.afagroupe.dto.AppUser;
import isi.afagroupe.entities.AppUserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AppUserMapper {
    AppUserEntity fromAppUser(AppUser appUser);
    AppUser toAppUser(AppUserEntity appUserEntity);
}
