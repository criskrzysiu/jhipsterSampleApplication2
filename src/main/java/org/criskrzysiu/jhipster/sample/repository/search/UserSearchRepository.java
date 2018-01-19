package org.criskrzysiu.jhipster.sample.repository.search;

import org.criskrzysiu.jhipster.sample.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {
}
