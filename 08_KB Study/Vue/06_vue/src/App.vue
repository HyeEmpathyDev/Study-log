<template>
  <div>
    <h2>관심있는 케이팝가수</h2>
    <hr />
    <ul>
      <CheckboxItemk
        v-for="idol in idols"
        :key="idol.id"
        :name="idol.name"
        :checked="idol.checked"
      />
    </ul>
  </div>
</template>

<script>
import CheckboxItemk from './components/CheckboxItemk.vue';
export default {
  name: 'App',
  components: { CheckboxItemk },
  data() {
    return {
      idols: [
        { id: 1, name: 'BTS', checked: true },
        { id: 2, name: 'Black Pink', checked: false },
        { id: 3, name: 'EXO', checked: false },
        { id: 4, name: 'ITZY', checked: false },
      ],
    };
  },
};
</script>
