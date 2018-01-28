(ns app.core
  (:require [reagent.core :as reagent :refer [atom]]
            [app.views :as views]))

(defn ^:export main []
  (reagent/render-component [views/app]
                            (.getElementById js/document "app")))
