package top.ss007.learn.kotlin.annotations

@Target(AnnotationTarget.FIELD,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY
    //,AnnotationTarget.PROPERTY
    )
@Retention(AnnotationRetention.RUNTIME)
annotation class Focus