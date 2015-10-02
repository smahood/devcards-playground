(ns responsive-design.core
  (:require
    #_[om.core :as om :include-macros true]
    [sablono.core :as sab :include-macros true]
    [cljs.test :as t :include-macros true]
    [project-management.core])
  (:require-macros
    [devcards.core :as dc :refer [defcard deftest]]))

(defcard
         "# Using [Devcards](https://github.com/bhauman/devcards) for Responsive Design

         Responsive design is a bit less fun than I want it to be. Primarily, it's a pain to test all the
         different widths and see how they appear. Devcards makes it easy to test as many different widths
         as we want.")

(defcard full-width-component
         "Here is our component at it's full width."
         (let [style {:border-top "solid 2px black"
                      :border-bottom "solid 2px black"
                      :width "1900px"
                      }]
           (sab/html [:div.testing {:style style}
                      [:h2 "My Component"]
                      [:p "This component prints out the style that has been applied to it."]
                      [:p (dc/edn style)]]))
         {}
         {:padding false}
         )
(defcard
  "In order to get the devcard to render the full width that we want to test (in this case
  1920 px), we had to add a couple CSS styles to our page to override the normal devcards style.
  We want to make sure we are only overriding this CSS on the pages that we need.
   ```
   body {min-width: 1920px;}
   .responsive_design-core .com-rigsomelight-devcards-container {min-width:1920px;  margin: 0;}
   ```
   After that, the only trick is making sure we have set the margin and size on our component to match the maximum
   case we want to deal with. In this case, the max width of the page will be 1920px, with padding of 10 px on either
   side, so we want to make sure our component is 1900 px wide with a left margin of 10. We also want to set
   the devcard options to include `{:padding false}`"
  )

(defcard
  "Test")