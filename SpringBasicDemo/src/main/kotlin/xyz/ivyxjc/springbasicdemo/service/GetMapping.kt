//package xyz.ivyxjc.springbasicdemo.service
//
///*
// * Copyright 2002-2016 the original author or authors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//import java.lang.annotation.Documented
//import java.lang.annotation.Retention
//import java.lang.annotation.RetentionPolicy
//import org.springframework.core.annotation.AliasFor
//import org.springframework.web.bind.annotation.DeleteMapping
//import org.springframework.web.bind.annotation.PatchMapping
//import org.springframework.web.bind.annotation.PostMapping
//import org.springframework.web.bind.annotation.PutMapping
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RequestMethod
//
///**
// * Annotation for mapping HTTP `GET` requests onto specific handler
// * methods.
// *
// *
// * Specifically, `@GetMapping` is a *composed annotation* that
// * acts as a shortcut for `@RequestMapping(method = RequestMethod.GET)`.
// *
// *
// * @author Sam Brannen
// * @since 4.3
// * @see PostMapping
// *
// * @see PutMapping
// *
// * @see DeleteMapping
// *
// * @see PatchMapping
// *
// * @see RequestMapping
// */
//@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
//@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@RequestMapping(method = arrayOf(RequestMethod.GET))
//annotation class GetMapping(
//    /**
//     * Alias for [RequestMapping.value].
//     */
//    @AliasFor(annotation = RequestMapping::class)
//    vararg val value: String = arrayOf(),
//    /**
//     * Alias for [RequestMapping.name].
//     */
//    @AliasFor(annotation = RequestMapping::class)
//    val name: String = "",
//    /**
//     * Alias for [RequestMapping.path].
//     */
//    @AliasFor(annotation = RequestMapping::class)
//    val path: Array<String> = arrayOf(),
//    /**
//     * Alias for [RequestMapping.params].
//     */
//    @AliasFor(annotation = RequestMapping::class)
//    val params: Array<String> = arrayOf(),
//    /**
//     * Alias for [RequestMapping.headers].
//     */
//    @AliasFor(annotation = RequestMapping::class)
//    val headers: Array<String> = arrayOf(),
//    /**
//     * Alias for [RequestMapping.consumes].
//     * @since 4.3.5
//     */
//    @AliasFor(annotation = RequestMapping::class)
//    val consumes: Array<String> = arrayOf(),
//    /**
//     * Alias for [RequestMapping.produces].
//     */
//    @AliasFor(annotation = RequestMapping::class)
//    val produces: Array<String> = arrayOf())
//}
//
