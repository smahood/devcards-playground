(ns devcards-playground.core
  (:require
   #_[om.core :as om :include-macros true]
   [sablono.core :as sab :include-macros true]
   [cljs.test :as t :include-macros true]
   [project-management.core]
   [responsive-design.core])
  (:require-macros
   [devcards.core :as dc :refer [defcard deftest]]))

(enable-console-print!)

(defn main []
  ;; conditionally start the app based on wether the #main-app-area
  ;; node is on the page
  (if-let [node (.getElementById js/document "main-app-area")]
    (js/React.render (sab/html [:div "This is working"]) node)))

(main)

;; remember to run lein figwheel and then browse to
;; http://localhost:3449/cards.html

