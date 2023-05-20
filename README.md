# 💡 서비스 소개
    - 큐잉! : 재난 속 당신을 구해줄 수 있는 시뮬레이션 어플 


# 👨‍👩‍👧‍👧 Contributors

|김수빈([@sub101](https://github.com/sub101))|이소민([@s6m1n](https://github.com/s6m1n))|이태희([@taeheeL](https://github.com/taeheeL))|이하은([@leeeha](https://github.com/leeeha))|
| :---: | :---: | :---: | :---: |
| <img width="400" src="https://avatars.githubusercontent.com/u/58244158?v=4"/> | <img width="400" src="https://github.com/SOPKATHON-9th/Damin-AOS/assets/68090939/e1424cb5-025f-4f65-b921-4a6b7e2589b3"/> | <img width="350" src="https://github.com/SOPKATHON-9th/Damin-AOS/assets/68090939/e579ce5b-d8fe-4b28-aae1-f6ba6f132bb0"/> | <img width="400" src="https://github.com/SOPKATHON-9th/Damin-AOS/assets/68090939/7e5dc6be-98d7-455b-b749-3326dda74566"/>|
|홈 화면<br>재난 상황 선택|스토리 설명<br>마이페이지|재난 상황 시뮬레이션|시뮬레이션 결과<br>행동 요령|

# 📄 컨벤션 및 브랜치 전략
## Coding Convention
- 함수와 변수 : `Lower Camel Case`
- Class 와 Interface : `Upper Camel Case`
- xml 파일 : `Snake Case`
    - activity_main
    - item_main
    - menu_main
- xml id : `Snake Case`
    - `btn_xx` : Button
    - `tv_xx` : TextView
    - `iv_xx` : ImageView
    - `rv_xx` : Recycler View
    - `chip_xx` : Chip
    - `layout_xx` : Layout
    - `sv_xx` : ScrollView
    - `fc_xx` : Fragment Container
- string, color, style : `Snake Case`

## Commit Convention
- 영문 또는 한글로 알아볼 수 있게
- 목적어와 동사 필수

## Branch Convention
- develop
    - feat/home
        - 더 이상 브렌치 파지 말 것
    - feat/situation
        - 더 이상 브렌치 파지 말 것
    - feat/discription
        - 더 이상 브렌치 파지 말 것
    - feat/game
        - 더 이상 브렌치 파지 말 것
    - feat/result
        - 더 이상 브렌치 파지 말 것
    - feat/mypage
        - 더 이상 브렌치 파지 말 것
        
- Merge 할 때 본인 이름 branch에서 어느 정도 개발이 됐을 때(View 구현 완료, 서버 통신 구현 완료, View refactoring) **feat/본인 이름 → develop** 으로 **merge pull request** 할 것
- 코드 리뷰 완료후 **Merge** 하고 **브렌치 삭제하지 말고** 계속 본인 이름 브렌치에서 작업 할 것
- 다른 팀원의 PR 이 **Merge** 되었으면 꼭 **pull** **받을 것!!!!!!!** (이 부분에서 소통이 굉장히 중요합니다) : `git pull origin develop`
    - 안스에서 Update 표시 있으면 그냥 pull 무조건 무조건 받아주세요 하하하
    - 이 때 **Merge Conflict**가 발생하면 꼭 호출해서 해결할 것!!
    - pull 받고 **최소 push 한번** 하고 작업할 것!!

## Package Convention
- data
    - remote(원격)
        - Dto
        - ApiFactory
        - Service
    - local
        - data class
- module
- presentation
    - 화면 별로
        - ViewModel
        - Adaptor
        - Activity or Fragment
- util
    - Extension
    - base
        - BindingActivity etc


# 📸 팀원끼리 응원의 메시지를 담은 사진 촬영

<img width="700" src="https://github.com/SOPKATHON-9th/Damin-AOS/assets/68090939/335b4e48-20b9-4c50-921d-61bea4f21048" alt="솝커톤-응원사진" />

