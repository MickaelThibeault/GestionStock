package com.stock.gestionstock.repository;

import com.stock.gestionstock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Integer, Article> {

//    @Query(value = "select a from Article a where a.codeArticle = ?1 and a.designation = ?2")
//    List<Article> findByCustomQuery(String code, String designation);
//
//    List<Article> findByCodeArticleIgnoreCaseAndDesignationIgnoreCase(String codeArticle, String designation);
}
