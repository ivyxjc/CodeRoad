package xyz.ivyxjc.springbasicdemo.bean

import org.springframework.data.mongodb.core.mapping.Document


@Document(collection = "wikidata")
class WikiBean(
    var title: String,
    var sha1: String,
    var text: String? = null,
    var ns: String? = null,
    var id: String? = null,
    var parentid: String? = null,
    var timestamp: String? = null,
    var comment: String? = null,
    var model: String? = null,
    var format: String? = null
)

