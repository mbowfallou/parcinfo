package isi.afagroupe.mapping;

import isi.afagroupe.dto.AppUser;
import isi.afagroupe.entities.AppUserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AppUserMapper {
    AppUserMapper INSTANCE = Mappers.getMapper(AppUserMapper.class);
    AppUserEntity fromAppUser(AppUser appUser);
    AppUser toAppUser(AppUserEntity appUserEntity);
}
