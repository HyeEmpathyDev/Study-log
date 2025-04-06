<template>
  <div>
    <h2>App 지역컴포넌트</h2>
    <hr />
    <ul>
      <CheckboxItem />
      <CheckboxItem />
      <CheckboxItem />
      <CheckboxItem />
    </ul>
  </div>
</template>
<script>
import CheckboxItem from './components/CheckboxItem.vue';

export default {
  name: 'AppLocal',
  components: {
    CheckboxItem,
  },
};
</script>
