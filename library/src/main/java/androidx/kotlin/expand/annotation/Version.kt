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
annotation class Version(val version: IntArray, val log: Array<VersionLog>) {
    companion object {
        /**
         * implementation 'com.ydevelop:kotlinx:0.0.1'
         */
        const val BANANA: Int = 1

        /**
         * implementation 'com.ydevelop:kotlinx:0.0.2'
         */
        const val CHOCOLATE: Int = 2
    }
}