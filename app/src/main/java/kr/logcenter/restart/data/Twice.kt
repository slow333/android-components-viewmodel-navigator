package kr.logcenter.restart.data

import kr.logcenter.restart.R

data class Twice(
   val title: String,
   val image: Int,
   val description: String,
   val comment: String
)

val twiceList = listOf(
   Twice("twice", R.drawable.dh, "안녕하세요 트와이스입니다.",
      "안넝하세요 다현입니다. 반갑습니다. 잘나온 사진이에요. \n여러줄을 만들려고 임의로 작성하는 아무 의미 없는 말을 적고 있어요... \n" +
           "\uD83C\uDF89\uD83D\uDE02✔️\uD83D\uDC49\uD83D\uDC9A\uD83D\uDD34\uD83C\uDFDA️\uD83D\uDE80\uD83C\uDF88\uD83E\uDD23"),
   Twice("twice", R.drawable.dh001, "안녕하세요 트와이스입니다.","안넝하세요 다현입니다. 반갑습니다. 잘 못 나온 사진이에요"),
   Twice("twice", R.drawable.tw001, "안녕하세요 트와이스입니다.", "안넝하세요 트와이스 3명 입니다. 모모 별로 에요"),
   Twice("twice", R.drawable.tw002, "안녕하세요 트와이스입니다.", "안넝하세요 트와이스 전체 입니다. 9명 이었나 ?????"),
   Twice("twice", R.drawable.dh002, "안녕하세요 트와이스입니다.", "안넝하세요 다현입니다. 반갑습니다. 잘나온 사진이에요"),
   Twice("twice", R.drawable.dh003, "안녕하세요 트와이스입니다.", "안넝하세요 다현입니다. 반갑습니다. 잘나온 사진이에요. 🎉😂✔️👉💚🔴🏚️🚀🎈🤣"),
   Twice("twice", R.drawable.dh005, "안녕하세요 트와이스입니다.","안넝하세요 다현입니다. 반갑습니다. 잘나온 사진이에요. 🎉😂✔️👉💚🔴🏚️🚀🎈🤣"),
   Twice("black pink", R.drawable.bp001, "안녕하세요 블랙핑크입니다.", "좀 어리게 한 사진 입니다. 이름은 잘 몰라요"),
   Twice("black pink", R.drawable._5c, "안녕하세요 블랙핑크입니다.", "누가 사진인지 모르겠어요"),
   Twice("black pink", R.drawable.bp002, "안녕하세요 블랙핑크입니다.", "좀 성숙하게 한 사진 입니다. 이름은 잘 몰라요"),
   Twice("black pink", R.drawable.bp003, "안녕하세요 블랙핑크입니다.","누가 사진인지 모르겠어요"),
   Twice("black pink", R.drawable.bp004, "안녕하세요 블랙핑크입니다.", "전부 나온 건데 뭔 공연장에서 찍었나봐요"),
   Twice("black pink", R.drawable.bp005, "안녕하세요 블랙핑크입니다.","전부 나온 건데 어디서 찍었는지 잘 모르는 사진들 입니다."),
   Twice("black pink", R.drawable.bp006, "안녕하세요 블랙핑크입니다.","전부 나온 건데 어디서 찍었는지 잘 모르는 사진들 입니다."),
   Twice("black pink", R.drawable.bp007, "안녕하세요 블랙핑크입니다.","전부 나온 건데 어디서 찍었는지 잘 모르는 사진들 입니다."),
   Twice("black pink", R.drawable.bp008, "안녕하세요 블랙핑크입니다.","전부 나온 건데 어디서 찍었는지 잘 모르는 사진들 입니다."),
)