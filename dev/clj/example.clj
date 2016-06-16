(ns example
  (:require
    [mount.core :as mount :refer [defstate]]
    [conf :refer [config]]))

#_(mount/in-cljc-mode)

(def foo @config)

