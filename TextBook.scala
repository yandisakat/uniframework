/*
 * Reece Waldeck
 *  214218244
 */

case class TextBook (val isbn_code: String, val auth: String, val titl: String, val editn: String, val publishr: String,// val subjct: Subject
    )
{
  private var _isbn: String = isbn_code;
  private var _author: String = auth;
  private var _title: String = titl;
  private var _edition: String = editn;
  private var _publisher: String = publishr;
//  private var _subject: Subject = subjct;
  
  def isbn = _isbn;
  def author = _author;
  def title = _title;
  def edition = _edition;
  def publisher = _publisher;
 // def subject = _subject;
  
  def isbn_= (isbn:String) : Unit = _isbn = isbn;
  def author_= (author:String) : Unit = _author = author;
  def title_= (title:String) : Unit = _title = title;
  def edition_= (edition:String) : Unit = _edition = edition;
  def publisher_= (publisher:String) : Unit = _publisher = publisher;
//  def subject_= (subject:Subject) : Unit = _subject = subject;
}