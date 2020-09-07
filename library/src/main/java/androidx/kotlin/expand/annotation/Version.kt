package androidx.kotlin.expand.annotation

@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.FIELD,
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.TYPEALIAS
)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
annotation class Version(@Suppress("unused") val targetVersion: VersionLog) {
    companion object {
        /** implementation "com.ydevelop:kotlinx:lastVersion" */
        const val NONE: Int = -1
    }
}