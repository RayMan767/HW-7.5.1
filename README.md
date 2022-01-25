Небольшая игра TD   
Задача игрока расправиться с наступающими врагами до того как они пересекут карту с помощью строительства башен, атакующих их.  
Представим что у нас дорога от начала до финиша в 100 метров .  
Вдоль дороги мы можем построить до  5 атакующих башен.    
На самой дороге может быть до 3 врагов.  

Создать:  
1) Абстрактный класс Entity в нем должны быть здоровье, статус и метод получения урона объекта.  
2) Два интерфейса Attacking и Movable отвечающие за поведение созданных объектов.  
3) Класс Tower который принимает здоровье и атаку башни.  
4) Класс Orc который принимает здоровье и скорость орка.  
5) Класс OrcArcher который принимает здоровье, скорость и атаку орка.  
6) Класс Play который принимает массив башен, орков и начинает нашу игру.  

Игра крутится до победы одной из сторон.  
Орки выигрывают если дойдут до финиша.  
Башни выигрывают если убьют всех орков.   
Башни атакуют одного из орков пока не убъют его, затем переходят к следующему.  
Орки если могут атаковать, то атакуют сразу все башни.   

Пример кода в Main(В случае победы башен):  
Entity[] towers;  
       towers = new Entity[5];  
       towers[0] = new Tower(100,10);  
       towers[1] = new Tower(100,10);  

       Entity[] orcs;  
       orcs = new Entity[3];  
       orcs[0] = new Orc(30,1);  

       Play play = new Play(towers, orcs);  
 Вывод:  
The tower attack orc and deal 10 damage.  
The tower attack orc and deal 10 damage.  
The orc passed 1 meters!  
The tower attack orc and deal 10 damage.  
The orc was destroyed!  
Towers win!  

Пример кода в Main(В случае победы орков):  
Entity[] towers;  
towers = new Entity[5];  
towers[0] = new Tower(100,10);  
towers[1] = new Tower(100,10);

Entity[] orcs;  
orcs = new Entity[3];  
orcs[0] = new Orc(30,1);  
orcs[1] = new OrcArcher(50,50,50);  

Play play = new Play(towers, orcs);  

Вывод:  
The tower attack orc and deal 10 damage.  
The tower attack orc and deal 10 damage.  
The orc passed 1 meters!  
The orc archer passed 50 meters!  
The orc archer attack tower and deal 50 damage.  
The orc archer attack tower and deal 50 damage.  
The tower attack orc and deal 10 damage.  
The orc was destroyed!  
The tower attack orc archer and deal 10 damage.  
The orc archer passed 100 meters!  
Orcs win!  
