define(['controller/selectionController', 'model/cacheModel', 'component/_CRUDComponent', 'controller/tabController', 'component/scoreComponent'],
 function(SelectionController, CacheModel, CRUDComponent, TabController, ScoreComponent) {
    App.Component.CompositeComponent = App.Component.BasicComponent.extend({
        initialize: function() {
            this.componentId = App.Utils.randomInteger();
            this.name = "ScoreIntegration";
            this.scoreComponent = new ScoreComponent();
            this.scoreComponent.initialize();
            this.setupScoreComponent();
        },
        render: function(domElementId){
            if (domElementId) {
                var rootElementId = $("#"+domElementId);
                this.scoreElement = this.componentId + "-score";
                this.tabsElement = this.componentId + "-tabs";

                rootElementId.html("<div id='" + this.scoreElement + "'></div>" + "<div id='" + this.tabsElement + "'></div>");
            }
            this.scoreComponent.render(this.scoreElement);
        },
        setupScoreComponent: function() {
            
        }

    });

    return App.Component.CompositeComponent;
});