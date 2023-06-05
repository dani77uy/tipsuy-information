package com.github.dani77uy.tipsuy.information.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.github.dani77uy.tipsuy.information.domain.model.Match;

/**
 * @author DanielB20
 * @since 05-Jun-23
 */
@Repository
public interface MatchRepository extends MongoRepository<Match, Long> {


}
