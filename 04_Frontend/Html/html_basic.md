## 🚀 HTML 문서 구조 분석

### 💡 이걸 정리하게 된 이유

강사님이 코드 조각으로 html 기본 템플릿을 제공해주셨는데
그 구조를 이해하고 싶어서 정리해보게 되었다.
(너무 기초에 집착하는 건가....)

---

### ✅ HTML 기본구조?

```html
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>x</title>
  </head>
  <body>
    <h1></h1>
  </body>
</html>
```

---

#### `<!DOCTYPE html>` (문서 유형 선언)

```html
<!DOCTYPE html>
```

- **HTML5 문서임을 선언**.
- 웹 브라우저가 문서를 올바르게 해석하도록 도움.

#### `<head>` (문서의 메타 정보)

```html
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>x</title>
</head>
```

`<meta charset="UTF-8">`

- 문서의 문자 인코딩을 UTF-8로 설정한다는 뜻
- 이걸 안 쓰면 한글이 깨질 수 있음

`<meta name="viewport" content="width=device-width, initial-scale=1.0">'`

- 화면 크기를 모바일 환경에 맞게 조정하는 역할
- 스마트폰이나 태블릿 등 다양한 화면 크기에 맞게 반응형 웹 페이지를 만들 수 있도록 도와줌.

**👉 meta 태그들은 HTML 문서를 제대로 보이게 하기 위한 필수 설정**

### ❗ 정리하면서 느낀 점

나머지는 수업시간에 자주 들어서 아는데 저 부분들은 디폴트 값으로 하고 넘어가서 따로 공부해야 할 것 같다.

---
