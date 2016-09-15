(ns learn-clojure.view
  (:use hiccup.page hiccup.element)
)

(defn index-page [] "Bla")
(defn page-three []
  (html5
      [:html
        [:head]
        [:body "three"]
      ]
  )
)
