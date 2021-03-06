package scala.reflect
package macros

trait TypeTags {
  self: Context =>

  def WeakTypeTag[T](tpe: Type): WeakTypeTag[T]
  def TypeTag[T](tpe: Type): TypeTag[T]
}
