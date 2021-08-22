# テーブル設計(cookrecord)
```plantuml
@startuml
entity user_infos {
  * id:INT <NotNull,Auto_Increment>
  --
  * userName:VARCHAR(20) <NotNull>
  * password:VARCHAR(100) <NotNull>
}
entity records{
  * id:INT <NotNull,Auto_Increment>
  --
  * cookId:INT <NotNull>
  * userId:INT <NotNull>
}
entity dishes{
  * id:INT <NotNull,Auto_Increment>
  --
  * dishName:VARCHAR(50) <NotNull>
  * materialId:VARCHAR(50) <Null>
  * calorie:INT <NULL>
  * categoryId:INT <NULL>
}
entity materials {
  * id:VARCHAR(50) <Null>
  --
  * name:VARCHAR(50) <Null>
}
entity dish_kinds{
  * id:INT <NotNull>
  --
  * kindName:String <NotNull>
}

records }o--|| user_infos
records }o--|| dishes
dishes }|--|{ materials
dishes }o--|| dish_kinds

@enduml
```plantuml
