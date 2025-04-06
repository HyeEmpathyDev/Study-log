<template>
  <div>
    <InputName @nameChanged="name = $event" />
    <h2>App 데이터: {{ name }}</h2>
  </div>
</template>
<script>
import InputName from './components/InputName.vue';

export default {
  name: 'App',
  components: { InputName },
  data() {
    return {
      name: '',
    };
  },
};
</script>
