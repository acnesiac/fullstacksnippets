/**
 * Ver index.html para las templates
 */

/**
 * LibroView 
 * Vista item libro para listado
 * encapuslado en <li></li>
 */
LibroView = Backbone.View.extend({
	tagName: "li",

	//renderizar vista cuando el modelo cambie
	initialize: function()
	{
		//this.model.on("change", this.render, this);
		this.listenTo(this.model, "change", this.render);
	},

	render: function()
	{
		this.$el.html(_.template($('#itemTemplate').html(),this.model.attributes));
	}
});

/**
 * LibroFichaView 
 * Vista item libro en ficha
 * encapuslado en <div></div>
 */
LibroFichaView = Backbone.View.extend({

	//renderizar vista cuando el modelo cambie
	initialize: function()
	{
		// this.model.on("change", this.render, this);
		this.listenTo(this.model, "change", this.render);
	},

	render: function()
	{
		this.$el.html(_.template($('#fichaTemplate').html(),this.model.attributes));
	}
});

/**
 * LibroListaView
 * Listado de items libro
 * encpasulado en <ul></ul>
 */
LibroListaView = Backbone.View.extend({

	tagName: "ul",

	initialize: function()
	{
		//renderizar vista cuando la coll se resetee (datos nuevos)
		//o haya un evento sort (ordenar)
		this.listenTo(this.collection, "reset", this.render);
		this.listenTo(this.collection, "sort", this.render);
		// this.collection.on("reset", this.render, this);
		// this.collection.on("sort", this.render, this);
		//this.collection.on("add", this.addOne, this);

	},

	addAll: function()
	{
		this.collection.forEach(this.addOne, this);
	},

	render: function()
	{
		this.$el.empty();
		this.addAll();
	},

	addOne: function(item)
	{
		var itemView = new LibroView({model: item});
		itemView.render();
		this.$el.append(itemView.el);
	}

});
