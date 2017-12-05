package xyz.ivyxjc.springbasicdemo.service

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import xyz.ivyxjc.springbasicdemo.bean.WikiBean


interface WikiRepository : MongoRepository<WikiBean?, Long> {
    @Query("{title:?0}")
    fun findOneByTitle(title: String): WikiBean?

    @Query("{title:{\$regex:'.*?0.*'}}")
    fun findListByTitle(title: String): List<WikiBean>?


}

