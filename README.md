# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Factory Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي اكتر من class كلهم بيعملو extend او implement ل parent واحد مشترك و عايز اعمل factory class اديله نوع ال class ال child اللي عايز اعمل منه object و هو يعمله و يرجعهولي
# بيتكون من ايه البرنامج ده ؟
- اولا package ال vehicle:
  - ال Car
  - ال Motorcycle
  - ال Vehicle و ده ال Parent بتاع Car و Motorcycle
- ثانيا package ال factory:
  - ال vehicleFactory و ده ال مصنع اللي اتكلمنا عنه بديله النوع اللي عايز اصنعه و هو بيعمله و يرجعهولي
