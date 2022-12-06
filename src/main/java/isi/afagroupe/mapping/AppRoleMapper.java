package isi.afagroupe.mapping;

import isi.afagroupe.dto.AppRole;
import isi.afagroupe.entities.AppRoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AppRoleMapper {
    AppRoleMapper INSTANCE = Mappers.getMapper(AppRoleMapper.class);
    AppRoleEntity fromAppRole(AppRole appRole);
    AppRole toAppRole(AppRoleEntity appRoleEntity);
}
