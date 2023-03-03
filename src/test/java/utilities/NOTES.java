package utilities;

public class NOTES {
    /*
    Scenari Outline ile DDT yapılabilir. Scenario Outline iyi bilinmelidir.
Test adimlarini(STEPS) data reusable yapmak icin kullanilir
En çok kullanılan cucumber ozelliklerinden biridir
Examples kelisi veri girisleri icin kullanilmalidir
Step definitionslardaki data tipi STRINGdir
Examples kelimesi en sonda kullanilir
Data Tables ile DDT yapılabilir
Test adimlarini(STEPS) data reusable yapmak icin kullanilir
Scenari Outline kadar yaygın degildir
Examples kelimesi kullanılmaz
Step definitionslardaki data tipi DATATABLE
DataTablelar ara adimlardada(STEPS) kullanilabilir
NOT: Datatables ve Scenario Outline birlikle kullanilabilir
     */

    /*
    What is collections in JAVA? -> list, set, queue
How did you use collections in your framework? -> I use collections when especially I need to store multiple test data . I use Collections when I try to get data form Excel, or DataTables. For example, I store the multiple login credentials in my excel sheet, and I use ExcelUtil class to get the data as a List. I actually have ExcelUtil class that has Java Codes to get the data from an excel sheet. And in that ExcelUtil we use collection, I can get the list of each column name, or I can get the list of data in different form.
I also use collections when I expect multiple elements. For example findElements() method returns a List of WebElement- List<WebElement>
getWindowHandles returns set of string- Set<String>
When I use Data Table in my cucumber framework, I use collections
I can store the data that comes from DataTables as List<Map<String,String>>
I can also store the data that comes from DataTables as List<List<String>> or Just List<String>
I have Utils classes. In the util classes I used collection a lot. For example, I have Excel Util class
When I get the column names of an excel sheet, I store column names in List<String>
When I the data list from excel, I put data list in List<Map<String, String>>
     */

    /*
    ***TURKCESI
    * Collectionslar nelerdir? -> list, set, queue
Collectionslari frameworkunde nasıl kullandın? -> Collectionslari ozellikle coklu data ihtiyacimiz oldugunda kullanırız.
Ornegin, findElements metotu kullanildiginda birden fazla element beklediğim icin, List<WebElement> kullanırız.
Yada, çoklu pencere geçişlerinde getWindowHandles ile Set kullanırız.
Dropdowndaki tum elementleri getOptions metot ile aldigimda List<WebElement> e koyariz.
Frameforkumuzde bazı utility classlar kullanıyoruz. Bunlarin icince çok sayıda collections kullanıyoruz. Ornegin ExcelUtils datalarını list e koyan metotlarımız vardır.
Cucumberda DataTables kullandigimda, gelen verileri List yada Map de depolayabiliriz.
     */
}
