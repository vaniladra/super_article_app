package ir.maktab;


import ir.maktab.utils.DButils;
import ir.maktab.utils.LoggerApis;
import ir.maktab.views.WelcomePage;

import java.sql.Connection;

public class ArticleApp implements LoggerApis {
    // برنامه ا ی طراحی کنید که شامل موجودیت های زیر باشد.:

    // User(id, username, nationalCode, birthday, password)

    // Article(
    //      id, title, brief, content,
    //      createDate, isPublished,
    //      lastUpdateDate, publishDate)

    // Category(id, title, description)

    // Tag( id, title)

    //================    STEP 1 DONE   ================\\

    // برنامه با نمایش منو برای کاربر آغاز میشود
    // و امکان ورود،
    // ثبت نام
    // یا دیدن مقاالت
    // را به وی میدهد .

    //================    STEP 2    ================\\


    //اگر کاربر دیدن همه مقاالت را انتخاب کند،
    // لیست ی از عنوان و خالصه همه مقاالت
    // منتشر شده به
    //وی نشان داده میشود، سپس می تواند با انتخاب هر کدام، اطالعات کامل آن را مشاهده نماید .
    //برای ثبت نام
    // کدملی کاربر به صورت خودکار به عنوان رمز ورود
    // او ثبت میشود و سپس پس از ورو د
    //میتواند رمز عبور خود را تغیی ر دهد.
    // کاربر پس از ورود می تواند فعالیت های زیر را انجام دهد:
    //• مقاله های خود را مشاهده نماید
    //• مقاله خود را ویرایش نماید
    // )تغییر اطاعات، انتشار یا لغو انتشار(
    //• مقاله جد ید وارد کند
    //در هنگام نوشتن مقاله جد ید
    // میبایست لیست دسته بند ی ها به کاربر نمایش داده شود و اگر دسته
    //بند ی مورد نظر و ی وجود نداشت بتواند دسته بند ی جد ی د ی اضافه کند.
    // مقاله پس از ثبت توسط
    //کاربر به صورت خودکار منتشر نمیشود
    // و کاربر میبایست به صورت جداگانه
    // امکان منتشر کردن آن
    //را داشته باشد.
    //هر مقاله باید لیستی از تگ داشته باش د
    // و در صورتی که تگ مورد نظرنویسنده در سامانه وجود نداشت
    //باید بتواند تگ مورد نظر خود را ایجاد کند.
    //به صورت پیش فرض هر مقاله تنها توسط ی ک کاربر نوشته شده
    // و تنها یک دسته بند ی دارد. (تشخیص
    //کامل روابط به عهده کاوندان است)
    //
    // توجه: ابتدا کالس های جاوا را به همراه روابط میان کالس ها طراحی کنید )
    // UML ،)سپس با توجه به
    //کالس های طراحی شده
    // جدولهای متناظر در پایگاه داده را ایجاد کرده
    // و برنامه را به آن متصل کنید .
    //نمودار ERD مربوط به موجودیت ها را نیز طراحی
    // و از مفاهیم OOP در این تمرین استفاده کنید.
    //


    public static void main(String[] args) {

        new WelcomePage();

    }

}
