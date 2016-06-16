(ns example
  (:require
    [mount.core :as mount :refer [defstate]]
    [conf :refer [config]]))

#_(println config) ;<--- uncomment this line to see the exception on startup

(mount/in-cljc-mode)

(println config)

(def foo @config)

