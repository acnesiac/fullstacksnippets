var PanelView = Backbone.View.extend(
{
	el  : ".panel-body",
	events : {
		"click #default" : "clickme"
	},

	clickme : function () {
		console.log("inside view ");
	}

}
);