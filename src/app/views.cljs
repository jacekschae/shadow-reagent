(ns app.views
  (:require [app.state :refer [app-state]]
            [app.events :refer [increment decrement]]))

(defn header
  []
  [:div
   [:h1 "A template for reagent apps"]])

(defn counter
  []
  [:div
   [:button.btn {:on-click #(increment %)} "-"]
   [:button {:disabled true} (get @app-state :count)]
   [:button.btn {:on-click #(decrement %)} "+"]])

(defn app []
  [:div
   [header]
   [counter]])
