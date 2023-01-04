# Adventure Game
- I made a text based adventure game with Java.  
- When you start the game you have to choose a character. There are some obstacles we have to deal with. 
There are weapons and armors we can use to fight them. We can choose all of them and they all have different values.
According to the places we choose, we encounter some obstacles and it is a game where we try to fight them.

![Karakterler](https://user-images.githubusercontent.com/93681938/210350765-1311690e-1e42-4a41-b122-1aafdd280c29.png)  
![Canavarlar](https://user-images.githubusercontent.com/93681938/210350794-bf93067d-776b-4978-951c-90605c4a207f.png)  
![Silahlar](https://user-images.githubusercontent.com/93681938/210350807-619c17c6-cbd4-47f2-85e6-dededdc86434.png)  
![Zırhlar](https://user-images.githubusercontent.com/93681938/210350823-ec01d2ce-14ec-492d-9d4b-bab456b4f274.png)  

## Features of Places
- Güvenli Ev
Özellik : Can Yenileniyor  
- Mağara
Canavar : Zombi (1-3 Adet)  
Özellik : Savaş + Ganimet  
Eşya : Yemek (Food)  
- Orman
Canavar : Vampir (1-3 Adet)  
Özellik : Savaş + Ganimet  
Eşya : Odun (Firewood)  
- Nehir
Canavar : Ayı (1-3 Adet)  
Özellik : Savaş + Ganimet  
Eşya : Su (Water)  
- Mağaza
Özellik : Destekleyici Eşyalar Satın Almak  
Silah : Tabanca,Kılıç,Tüfek  
Zırh : Hafif,Orta,Ağır  
## Class Diagram  
![class-diagram](https://user-images.githubusercontent.com/93681938/210351889-b302ed14-70b6-4209-886e-fa45524d1377.jpg)  

## Homeworks
1 - Oyunu bitirebilmek için savaş bölgelerindeki tüm düşmanlar temizlendikten sonra bölgeye özel ödülü oyunucun envanterine eklenmelidir. Eğer oyuncu tüm ödülleri toplayıp "Güvenli Eve" dönebilirse oyunu kazanır. Ayrıca ödül kazanılan bölgeye tekrar giriş yapılamaz.  

Bölge Ödülleri :
Mağara => Yemek (Food)  
Orman => Odun (Firewood)  
Nehir => Su (Water)  

2 - Oyuncu bir canavarla karşılaştığında ilk hamleyi kimin yapacağını, %50 şans ile belirlenmesi. (Şuan ki durumda ilk vuran her zaman oyuncu)

3 - Yeni bir savaş bölgesi eklenmeli. Bu bölgenin amacı yenilen rakiplerden rastgele para, silah veya zırh kazanma ihtimali olması.

Bölge Adı : Maden  
Canavar : Yılan (1-5 Adet)  
Özellik : Savaş ve Ganimet  
Eşya : Para, Silah veya Zırh  

Yılan Özellikleri :
ID : 4  
HASAR : Rastgele (3 ve 6 arası)  
SAĞLIK :12  
PARA : Yok (Onun yerine eşya kazanma ihtimali)  

Yenilen bir rakiplerden düşen eşyalar :  
Silah Kazanma İhtimali : 15%  
Tüfek Kazanma İhtimali : 20%  
Kılıç Kazanma İhtimali : 30%  
Tabanca Kazanma İhtimali : 50%  
Zırh Kazanma İhtimali : 15%  
Ağır Zırh Kazanma İhtimali : 20%  
Orta Zırh Kazanma İhtimali : 30%  
Hafif Zırh Kazanma İhtimali : 50%  
Para Kazanma İhtimali : 25%  
10 Para Kazanma İhtimali: 20%  
5 Para Kazanma İhtimali: 30%  
1 Para Kazanma İhtimali: 50%  
Hiç birşey kazanamama ihtimali : 45%  
