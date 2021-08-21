package com.example.blog

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository) =
        ApplicationRunner {

            val hui = userRepository.save(User("jxhui", "Jimmy", "Hui"))
            articleRepository.save(Article(
                title = "Reactor Bismuth is out",
                headline = "Lorem ipsum",
                content = "dolor si amet",
                author = hui
            ))

            articleRepository.save(Article(
                title = "何これ",
                headline = "ヘドライン",
                content = "コンテンツ",
                author = hui
            ))

        }
}