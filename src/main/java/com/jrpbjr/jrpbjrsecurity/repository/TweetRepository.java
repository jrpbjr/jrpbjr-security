package com.jrpbjr.jrpbjrsecurity.repository;

import com.jrpbjr.jrpbjrsecurity.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {

}
