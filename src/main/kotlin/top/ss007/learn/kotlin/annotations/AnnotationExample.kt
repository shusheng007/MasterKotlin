package top.ss007.learn.kotlin.annotations

class AnnotationExample(
    @field:MyAnnot val name,
    @get:MyAnnot val age,
    @param:MyAnnot val height
) {
}