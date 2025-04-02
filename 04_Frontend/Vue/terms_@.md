## 🚀 @?

```html
<input id="a" type="text" :value="name" @input="changeName" />
```

문제 읽다가 갑자기 등장한 **@**...

### ✅ 기본 개념: @는 v-on의 축약

- **@** 기호는 Vue에서 **DOM 이벤트를 바인딩할 때 사용**하는 축약 문법

👉 Vue 컴포넌트 안 `<template>` 태그 내에서만 사용 가능!

---

그러다 Router로 넘어왔는데 다시 **@** 등장

### ✅ `@` as Path Alias (경로 별칭)

- `@`을 `src/` 디렉토리의 별칭(alias)으로 사용
- `@`는 `src/` 디렉토리를 가리키는 것

👉 예시

```js
import Header from '@/components/Header.vue';
import api from '@/utils/api.js';
```

⚙️ 설정 위치 (Vite 기준)

```js
// vite.config.js
import path from 'path';

export default defineConfig({
  resolve: {
    alias: {
      '@': path.resolve(__dirname, './src'),
    },
  },
});
```

👉 자바스크립트 코드에서만 사용 가능

### ❗ 정리하면서 느낀 점

최종정리를 해봐야겠다

| 문맥               | 의미            | 위치         | 예시                                 |
| ------------------ | --------------- | ------------ | ------------------------------------ |
| `@click`           | 이벤트 바인딩   | `<template>` | `<button @click="fn">`               |
| `@/components/...` | 파일 경로 alias | `<script>`   | `import X from '@/components/X.vue'` |

---

#### [📂 ](.md)
