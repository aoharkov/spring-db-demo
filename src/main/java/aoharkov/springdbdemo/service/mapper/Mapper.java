package aoharkov.springdbdemo.service.mapper;

public interface Mapper<E, D> {

    E mapDTOToEntity(D item);

    D mapEntityToDTO(E entity);
}
