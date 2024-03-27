# 다형성 좀비 콘솔 게임

> 소개

플레이어가 맵(1~10)을 모험합니다. <br>
모험 도중에 만나는 몬스터들을 모두 해치우고 <br>
목적지(10)에 도착하도록 해주세요! <br>
<br>
> 플레이어 설명

* **플레이어의 기본 스탯 ( MAX PH:200 / 최대 공격력:30 / 포션:2개 )**

게임을 실행하면, 플레이어는 기본 스탯을 지닌 채로 맵의 시작점(1)에서 탄생하게 됩니다.

플레이어는 '앞으로 이동[1]'을 통해 맵을 모험하다 몬스터를 만나면 **[공격모드]** 로 전환하게 됩니다.

**[공격모드]** <br>
'공격하기[1]'를 선택하면 최대 공격력(30) 내에서 몬스터에게 데미지를 입힙니다. <br>
'포션먹기[2]'를 선택하면 플레이어가 체력을 최대로 회복합니다. <br>
*★ 플레이어가 사망하게 되면 게임이 종료되니, 포션을 적절히 활용하세요!*

몬스터를 해치우면 [공격모드]가 해제되고 다시 모험을 시작합니다.
플레이어가 목적지(10)에 도착하게 되면 게임이 종료됩니다.<br>
<br>

> 좀비(몬스터) 설명

* **좀비의 기본 스탯 ( MAX PH:100 / 최대 공격력:10 )**

플레이어가 좀비를 공격하면 좀비도 '깨물기'를 통해 플레이어를 공격합니다. <br>
<br>

> 보스(몬스터) 설명

* **보스의 기본 스탯 ( MAX PH:300 / 최대 공격력:20 / Shield:100 )**

보스는 일반 몬스터와는 달리 **쉴드**가 존재합니다. <br>
쉴드를 먼저 부숴야만 데미지를 입힐 수가 있습니다. <br>
<br>
보스는 **25%의 확률로 궁극기**를 사용합니다. <br>
궁극기를 사용한 보스는 공격력의 2배에 달하는 공격을 하여 치명상을 입힙니다. <br>
<br>

> Class Diagram(UML)

![diagram](https://github.com/ksy7615/zombie/blob/master/images/ZombieGame%20(2).jpg)

> Demo

![diagram](https://github.com/ksy7615/zombie/blob/master/images/playZombieGame.gif)
