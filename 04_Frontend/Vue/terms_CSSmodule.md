## 🚀 CSS Module

### 💡 이걸 정리하게 된 이유

- CSS 스타일을 객체처럼 처리한다는데... 무슨 의미인지 모르겠다.

### ✅ CSS Modules란?

- `<style module>` 태그를 사용하여 활성화
- CSS 클래스명을 **JavaScript 객체처럼** 다룰 수 있음
- 클래스명이 **자동으로 고유하게 변환됨** (ex. `.box_xyz123`)

  그러니까... 원래 내가 했던 방식은 아래처럼 클래스 이름을 `title`이라고 붙여서 `style`영역으로 가서 `.title` 로 스타일 적용

```vue
<template>
  <div class="title">Hello</div>
</template>

<style>
.title {
  color: red;
}
</style>
```

- 그런데?❗ CSS를 모듈은? 기존 `.title` 클래스 앞에 `$style`을 붙여주는 걸로 `.title`에 고유한 이름이 생긴다는 뜻.

  ❗단, 이렇게 쓰려면 `<style module>` 태그를 써야함

```vue
<template>
  <div :class="$style.title">Hello</div>
</template>

<style module>
.title {
  color: red;
}
</style>
```

### ✅ CSS Module의 장점

| 장점             | 설명                                                    |
| ---------------- | ------------------------------------------------------- |
| 클래스 충돌 방지 | 다른 컴포넌트의 클래스와 겹치지 않음                    |
| JS처럼 제어 가능 | `$style.box`, `$style[condition ? 'a' : 'b']` 사용 가능 |
| 유지보수 쉬움    | 스타일이 해당 컴포넌트 안에서만 유효함                  |
| 팀 협업에 강함   | 전역 네이밍 규칙 없이도 안정적 운영 가능                |

### ❗ 정리하면서 느낀 점

아~ 절주온 클론 코딩 프로젝트 때... 각자 만든 거 합쳤을 때... 클래스 이름을 똑같이 지어서 각자 만든 css 스타일이 난리났었는데..😮‍💨😵‍💫 vue로 이렇게 하면 좋았을..

---

#### [📂 ](.md)
