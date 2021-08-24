# テーブル設計(cookrecord)
```plantuml
@startuml
entity user_infos {
  * id:INT <NotNull,Auto_Increment>
  --
  * user_name:VARCHAR(20) <NotNull>
  * password:VARCHAR(100) <NotNull>
}
entity records{
  * id:INT <NotNull,Auto_Increment>
  --
  * cook_id:INT <NotNull>
  * use_id:INT <NotNull>
}
entity dishes{
  * id:INT <NotNull,Auto_Increment>
  --
  * dish_name:VARCHAR(50) <NotNull>
  * calorie:INT <NULL>
  * category_id:INT <NULL>
  * cook_date:date <NotNull>
}
entity dish_kinds{
  * id:INT <NotNull>
  --
  * kind_name:String <NotNull>
}

records }o--|| user_infos
records }o--|| dishes
dishes }o--|| dish_kinds

@enduml
```plantuml
