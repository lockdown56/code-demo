local assert = require "luassert"
local say = require "say"

local function has_property(state, args)
    local property = args[1]
    local t = args[2]

    for key, value in pairs(t) do
        if key == property then
            return true, {value}
        end
    end

    return false
end

say:set_namespace("en")
say:set("assertion.has_property.positive", "expected property %s in: \nTs")
say:set("assertion.has_property.negative", "expected property %s to not be in: \n%s")
assert:register("assertion", "has_property", has_property, "assertion.has_property.positive", "assertion.has_property.negative")

local name, n = assert.has_property("name", {name = "zhangsan"})
print(name)