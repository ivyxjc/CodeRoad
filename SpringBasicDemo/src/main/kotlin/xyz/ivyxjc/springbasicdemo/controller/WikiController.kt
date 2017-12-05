package xyz.ivyxjc.springbasicdemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import xyz.ivyxjc.GetPostMapping
import xyz.ivyxjc.springbasicdemo.bean.WikiBean
import xyz.ivyxjc.springbasicdemo.service.WikiRepository


@RestController
class WikiController(private val repository: WikiRepository) {


    fun beanForNull(title: String): WikiBean {
        return WikiBean(title = "Not found", sha1 = "null", text = "Not Found ${title}")
    }

    @GetPostMapping("/apis/title/one/{title}")
    fun findByTitle(@PathVariable title: String): WikiBean {
        val bean = repository.findOneByTitle(title)
        return bean ?: beanForNull(title)
    }

//    @GetMapping("/apis/fuzzy/title/{title}")
//    fun findByTitleFuzzy(@PathVariable title: String):WikiBean{
//        val bean:WikiBean?
//        bean=repository.findOneByTitle(title)
//        return bean?: beanForNull(title)
//    }

    @GetMapping("/apis/title/list/beans/{title}")
    fun findListByTitle(@PathVariable title: String): List<WikiBean> {
        val list = repository.findListByTitle(title)
        return list ?: listOf(beanForNull(title))
    }

//    @GetMapping("/apis/title/list/titles/{title}")
//    fun findListTitlesByTitle(@PathVariable title: String): List<String> {
//        val list = repository.findListByTitle(title)
//        val res = ArrayList<String>()
//        list?.forEach({ res.add(it.title) })
//        return res
//    }


    @GetPostMapping("/apis/title/list/{params}/{title}")
    fun findListParamsByTitle(@PathVariable params: String, @PathVariable title: String): List<String> {
        val list = repository.findListByTitle(title)
        val res = ArrayList<String>()
        val it = list?.iterator()
        if (it != null) {
            7
            while (it.hasNext()) {
                val t: WikiBean = it.next()
                val va = extract(params, t)
                if (va != null) {
                    res.add(va)
                }
            }
        }
        return res
    }
}


private fun extract(params: String, bean: WikiBean) = when (params) {
    "titles" -> bean.title
    "texts" -> bean.text
    else -> null
}
