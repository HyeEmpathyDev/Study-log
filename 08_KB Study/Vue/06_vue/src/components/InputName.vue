<template>
  <div style="border: 1px solid #ccc; padding: 10px">
    <label>이름: <input type="text" v-model="name" /></label>
    <button @click="nameChangeHandler()">이벤트 발신</button>
  </div>
</template>

<script>
export default {
  name: 'InputName',
  data() {
    return {
      name: '',
    };
  },
  methods: {
    nameChangeHandler() {
      // ✅ 유효성 검사
      if (
        !this.name || // 1. 값이 없거나
        typeof this.name !== 'string' || // 2. 문자열이 아니거나
        this.name.length < 3 // 3. 3자 미만이면
      ) {
        console.warn('⚠️ 이름은 3자 이상의 문자열이어야 합니다.');
        return; // ❌ emit 안 함!
      }

      // ✅ 통과 시 emit
      this.$emit('nameChanged', this.name);
    },
  },
};
</script>
