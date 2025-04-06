<template>
  <div>
    x : <input type="text" v-model.number="x" />
    <br />
    결과 : {{ result }}
  </div>
</template>
<script>
import { ref, watch } from 'vue';
export default {
  name: 'Calc',
  setup() {
    const x = ref(0); // 0으로 초기화
    const result = ref(0); // 0으로 초기화
    watch(x, (newVal, oldVal) => {
      console.log(`x 값 변경됨: 이전=${oldVal}, 새값=${newVal}`);
    });

    return { x, result };
  },
};
</script>
