# آزمایشگاه مهندسی نرم‌افزار - آزمایش سوم - روش توسعه آزمون‌رانه و پوشش آزمون
اعضای گروه:
امیرحسین حاجی محمد رضایی - ۹۹۱۰۹۲۵۲
علی رازقندی - ۹۹۱۰۹۲۹۶
سید‌رضا قمقام - ۹۹۱۷۰۵۴۲

[لینک مستندات آزمایش سوم](https://github.com/ssc-public/Software-Engineering-Lab/blob/main/courseworks/experiments/TDD-and-coverage.md)

## گزارش بخش دوم آزمایش - توسعه توابع جستجو با روش TDD 

در ابتدا با باز کردن پروژه در IntelliJ، بعد از مطالعه کد و زدن گزینه generate بر روی اسم کلاس Library یک فایل تست در پوشه مدنظر برای آن ایجاد می‌کنم:
![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/2.PNG)

که فایل ابتدایی ایجاد‌شده به صورت زیر خواهد بود:

![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/3.PNG)

حال ابتدا برای توسعه تابع جستجو دانشج.یان، در ابتدا تست‌های آن را می‌نویسم، این تست‌ها شامل ایجاد کتابخانه به ازای هرتست (متود setup)، تست جستجو دانشجویانی که در کتابخانه ثبت‌نام شده یا نشده‌اند و جستجو بر‌اساس نویسنده و عنوان (که خروجی در این حالت ندارد) می‌باشد و در این حالت کلا ۴ تست داریم که به صورت زیر هستند:

![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/4.PNG)
![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/5.PNG)
![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/6.PNG)

بعد از این مرحله، نتیجه تست‌ها را در حالتی که هنوز ویژگی موردنظر پیاده‌سازی نشده است، را بررسی می‌کنیم. همانطور که مشاهده می‌کنید در انی حالت تنها تست مذربوط به جستجو با اسم نویسنده و عنوان کتاب پاس می‌شود به خاطر اینکه در کد اولیه این متود‌ها null برمی‌گردانند.
![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/7.PNG)

حال در قدم بعدی ویژگی که در اینجا جستجو دانجویان ثبت‌نام شده در کتابخانه است را ایجاد می‌کنم:

![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/8.PNG)

حال بعد از پیاده‌سازی این ویژگی، نتیجه تست‌های مربوط به آن به صورت زیر خواهد بود:

![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/9.PNG)

در مرحله بعدی برای refactoring کد ایجاد‌شده، دیگر نیازی به تغییر دادن آن نیست زیرا کد به صورت بهینه پیاده شده است. حال در مرحله بعدی همین قدم‌ها را برای تابع جستجو کتاب‌های کتابخانه طی می‌کنم:
ایجاد تست‌ها:

![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/10.PNG)
![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/11.PNG)
![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/12.PNG)
![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/13.PNG)

نتیجه تست‌ها قبل از پیاده‌سازی ویژگی:

![]()

پیاده‌سازی ویژگی:

![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/14.PNG)

نتیجه تست‌ها بعد از پیاده‌سازی ویژگی:

![](https://github.com/amir-haji/SE_Lab_exp_3/blob/main/report%20screenshots/part%202%20screenshots/15.PNG)





