## 🚀 VUE 기본 구조 분석

### 💡 이걸 정리하게 된 이유

기초가 중요하다고 생각해서..

### ✅ VUE 기본 구조?

```html
<div id="app">{{ message }}</div>

<script src="https://unpkg.com/vue@3/dist/vue.global.js"></script>
<script type="text/javascript">
  const { createApp } = Vue;

  let vm = createApp({
    name: 'App',
    data() {
      return {
        message: 'Hello Vue!',
      };
    },
  });

  vm.mount('#app');
</script>
```

---

#### `<div id="app">{{ message }}</div>`

- `id="app"`: Vue 앱을 연결할 HTML 요소
- `{{ message }}`:
  - `data()` 안에 정의한 `message` 값을 화면에 표시해줌

#### `<script src="https://unpkg.com/vue@3/dist/vue.global.js"></script>`

- Vue 3을 **CDN**으로 불러오는 코드
- 브라우저에서 바로 Vue를 사용가능

#### `createApp({ ... })`

- Vue 앱을 생성하는 함수

```js
createApp({
  name: 'App', // 앱 이름 (선택 사항)
  data() {
    return {
      message: 'Hello Vue!',
    };
  },
});
```

- `date()` 반응형 데이터 저장소
- 사용자가 입력하는 값들이 여기에 저장된다..(?)

#### `vm.mount('#app')`

- Vue 앱을 id="app"인 DOM 요소에 마운트(연결)

- 이게 있어야 Vue가 실제 HTML 에서 동작!!!

### ❗ 정리하면서 느낀 점

왜 양방향 모델이라고 하는지 알겠음. 사용자가 입력한 값들이 data()를 통해서 반영되고 그 값들이 methods 등 함수를 거치면서 다시 사용자한테 반영되는 듯?

---

#### [📂DOM ](https://github.com/HyeEmpathyDev/Study-log/blob/Study_log/02_Terms/dom.md)
