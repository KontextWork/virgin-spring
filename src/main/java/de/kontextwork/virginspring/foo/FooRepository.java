package de.kontextwork.virginspring.foo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(
  path = "foos",
  itemResourceRel = "foo",
  collectionResourceRel = "foos"
)
public interface FooRepository extends PagingAndSortingRepository<Foo, Long>
{
}
