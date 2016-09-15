(ns learn-clojure.core
  (:use compojure.core
        ring.middleware.json
        ring.util.response
  )
  (:require [compojure.route :as route]
            [learn-clojure.view :as view]
  )
)

(defn foo [x] (str "hello " x))

(defroutes my_routes
  (GET "/" [] (foo "Bessias"))
  (GET "/two" [] (view/index-page))
  (GET "/three" [] (view/page-three))
  (GET "/json" [] (response {:email "adamatti@gmail.com"}))
  (route/resources "/")
)

(def app (wrap-json-response my_routes))
