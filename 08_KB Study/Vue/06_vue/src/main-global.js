// 전역컴포넌트
import CheckboxItem from './components/CheckboxItem.vue';
import { createApp } from 'vue';
import AppGlobal from './AppGlobal.vue';

createApp(AppGlobal).component('CheckboxItem', CheckboxItem).mount('#app');
