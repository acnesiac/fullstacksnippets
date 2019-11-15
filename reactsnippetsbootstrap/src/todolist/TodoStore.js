import EventEmitter from 'events';


const TodoStore = {
  items: [],

  emitter: new EventEmitter(),

  add: function(title) {
    let item = {
      title: title, 
      id: Math.random().toString().split('.')[1],
      completed: false
    }
    this.items.push(item);
    this.emitter.emit('change', this.items);
  },

  remove: function(id) {
    let idx = this.items.findIndex(function(obj) {
      return obj.id == id;
    });
    this.items.splice(idx, 1);
    this.emitter.emit('change', this.items);
  },

  update: function(id, completed) {
    let idx = this.items.findIndex(function(obj) {
      return obj.id == id;
    });
    this.items[idx].completed = completed;
    this.emitter.emit('change', this.items);

  }

}

export default TodoStore;

